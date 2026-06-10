// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelNorscaSlaaneshBody extends ModelBase {
	private final ModelRenderer bipedBody;
	private final ModelRenderer cape;
	private final ModelRenderer bitsuha;
	private final ModelRenderer bitsuha2;
	private final ModelRenderer press;
	private final ModelRenderer press2;
	private final ModelRenderer press3;
	private final ModelRenderer press4;
	private final ModelRenderer hide;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRIghtArm;

	public WFMModelNorscaSlaaneshBody() {
		textureWidth = 64;
		textureHeight = 64;

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.5F, false));

		cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 1.0F, 3.0F);
		bipedBody.addChild(cape);
		setRotationAngle(cape, 0.2182F, 0.0F, 0.0F);
		cape.cubeList.add(new ModelBox(cape, 32, 0, -7.5F, -2.0F, 0.0F, 16, 25, 0, 0.0F, false));

		bitsuha = new ModelRenderer(this);
		bitsuha.setRotationPoint(-3.0F, 4.0F, -3.0F);
		bipedBody.addChild(bitsuha);
		bitsuha.cubeList.add(new ModelBox(bitsuha, 0, 33, -1.5F, -3.0F, 0.0F, 4, 2, 1, 0.0F, false));

		bitsuha2 = new ModelRenderer(this);
		bitsuha2.setRotationPoint(2.0F, 4.0F, -3.0F);
		bipedBody.addChild(bitsuha2);
		bitsuha2.cubeList.add(new ModelBox(bitsuha2, 11, 33, -1.5F, -3.0F, 0.0F, 4, 2, 1, 0.0F, false));

		press = new ModelRenderer(this);
		press.setRotationPoint(-3.0F, 6.0F, -3.0F);
		bipedBody.addChild(press);
		press.cubeList.add(new ModelBox(press, 0, 38, 0.5F, -2.5F, 0.0F, 2, 2, 1, 0.0F, false));

		press2 = new ModelRenderer(this);
		press2.setRotationPoint(0.0F, 7.0F, -3.0F);
		bipedBody.addChild(press2);
		press2.cubeList.add(new ModelBox(press2, 0, 38, 0.5F, -3.5F, 0.0F, 2, 2, 1, 0.0F, false));

		press3 = new ModelRenderer(this);
		press3.setRotationPoint(0.0F, 9.0F, -3.0F);
		bipedBody.addChild(press3);
		press3.cubeList.add(new ModelBox(press3, 0, 38, 0.5F, -3.0F, 0.0F, 2, 2, 1, 0.0F, false));

		press4 = new ModelRenderer(this);
		press4.setRotationPoint(-3.0F, 9.0F, -3.0F);
		bipedBody.addChild(press4);
		press4.cubeList.add(new ModelBox(press4, 0, 38, 0.5F, -3.0F, 0.0F, 2, 2, 1, 0.0F, false));

		hide = new ModelRenderer(this);
		hide.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.addChild(hide);
		hide.cubeList.add(new ModelBox(hide, 2, 55, -9.0F, -3.0F, -1.0F, 18, 4, 4, 0.0F, false));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(7.0F, 2.0F, 0.0F);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 0, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.5F, true));

		bipedRIghtArm = new ModelRenderer(this);
		bipedRIghtArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		bipedRIghtArm.cubeList.add(new ModelBox(bipedRIghtArm, 16, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.5F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipedBody.render(f5);
		bipedLeftArm.render(f5);
		bipedRIghtArm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}