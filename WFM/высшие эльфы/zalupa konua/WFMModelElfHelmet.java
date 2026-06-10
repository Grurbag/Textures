// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer helmet2;
	private final ModelRenderer wing_left;
	private final ModelRenderer wing_right;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		helmet2 = new ModelRenderer(this);
		helmet2.setRotationPoint(0.0F, -6.0F, 0.0F);
		helmet.addChild(helmet2);
		setRotationAngle(helmet2, 0.0F, 0.0F, -0.7854F);
		helmet2.cubeList.add(new ModelBox(helmet2, 32, 0, -1.2F, -3.8F, -3.5F, 5, 5, 7, 0.0F, false));

		wing_left = new ModelRenderer(this);
		wing_left.setRotationPoint(-4.0F, -7.0F, 0.0F);
		helmet.addChild(wing_left);
		wing_left.cubeList.add(new ModelBox(wing_left, 0, 19, -0.6F, -5.0F, -3.0F, 0, 7, 6, 0.0F, false));

		wing_right = new ModelRenderer(this);
		wing_right.setRotationPoint(4.0F, -7.0F, 0.0F);
		helmet.addChild(wing_right);
		wing_right.cubeList.add(new ModelBox(wing_right, 0, 19, 0.6F, -5.0F, -3.0F, 0, 7, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		helmet.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}