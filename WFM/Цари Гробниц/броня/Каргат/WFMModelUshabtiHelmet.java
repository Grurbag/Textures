// Made with Blockbench 4.5.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer cluv;
	private final ModelRenderer cluv2;
	private final ModelRenderer cluv3;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		cluv = new ModelRenderer(this);
		cluv.setRotationPoint(0.0F, -2.0F, -5.0F);
		head.addChild(cluv);
		cluv.cubeList.add(new ModelBox(cluv, 50, 0, -2.5F, -3.0F, -1.0F, 5, 5, 2, 0.0F, false));

		cluv2 = new ModelRenderer(this);
		cluv2.setRotationPoint(1.0F, 0.0F, -1.0F);
		cluv.addChild(cluv2);
		setRotationAngle(cluv2, 0.2618F, 0.0F, 0.0F);
		cluv2.cubeList.add(new ModelBox(cluv2, 50, 10, -3.0F, -2.0F, -2.0F, 4, 4, 3, 0.0F, false));

		cluv3 = new ModelRenderer(this);
		cluv3.setRotationPoint(0.0F, 1.0F, -3.0F);
		cluv2.addChild(cluv3);
		cluv3.cubeList.add(new ModelBox(cluv3, 56, 19, -2.0F, -1.0F, 0.0F, 2, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}