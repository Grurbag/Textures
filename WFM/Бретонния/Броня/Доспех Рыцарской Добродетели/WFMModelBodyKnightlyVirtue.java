// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer cape;
	private final ModelRenderer hand_left;
	private final ModelRenderer shield;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 40, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 6.0F, 3.0F);
		body.addChild(cape);
		setRotationAngle(cape, 0.2182F, 0.0F, 0.0F);
		cape.cubeList.add(new ModelBox(cape, 0, 8, -7.0F, -6.0F, 0.0F, 14, 24, 0, 0.0F, false));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(5.0F, 2.0F, 0.0F);
		hand_left.cubeList.add(new ModelBox(hand_left, 33, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, true));

		shield = new ModelRenderer(this);
		shield.setRotationPoint(0.0F, 0.0F, -1.0F);
		hand_left.addChild(shield);
		shield.cubeList.add(new ModelBox(shield, 50, -7, 3.6F, -3.0F, -2.5F, 0, 10, 7, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		hand_left.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}