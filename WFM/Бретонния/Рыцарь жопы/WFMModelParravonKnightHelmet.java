// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelParravonKnightHelmet extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer crownv2_r1;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer head_r1;
	private final ModelRenderer Pero22_r1;
	private final ModelRenderer Pero22_r2;
	private final ModelRenderer Pero21_r1;
	private final ModelRenderer Pero22_r3;
	private final ModelRenderer Pero21_r2;
	private final ModelRenderer Pero21_r3;
	private final ModelRenderer Pero21_r4;
	private final ModelRenderer Pero21_r5;
	private final ModelRenderer head_r2;

	public WFMModelParravonKnightHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.75F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 1.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(5.0F, -8.0F, -1.0F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.4638F, 1.4796F, 1.3758F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 41, -6.0F, 1.0F, 0.3F, 7, 7, 0, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-5.0F, -8.0F, -1.0F);
		Head.addChild(cube_r2);
		setRotationAngle(cube_r2, 3.0543F, 0.0F, -3.1416F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 40, -10.5F, 2.0F, -5.8F, 11, 10, 0, 0.0F, true));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-5.0F, -8.0F, -1.0F);
		Head.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.4638F, -1.4796F, -1.3758F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 41, -1.0F, 1.0F, 0.3F, 7, 7, 0, 0.0F, true));

		crownv2_r1 = new ModelRenderer(this);
		crownv2_r1.setRotationPoint(0.0F, -9.0F, 0.0F);
		Head.addChild(crownv2_r1);
		setRotationAngle(crownv2_r1, -0.0873F, 0.0F, 0.0F);
		crownv2_r1.cubeList.add(new ModelBox(crownv2_r1, 24, 49, -5.0F, -3.0F, -5.3F, 10, 5, 10, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(6.0F, -8.0F, 0.0F);
		Head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -1.4399F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 38, -7.5F, -17.0F, 5.0F, 15, 17, 0, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-6.0F, -8.0F, 0.0F);
		Head.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 1.4399F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 38, -7.5F, -17.0F, 5.0F, 15, 17, 0, 0.0F, true));

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -8.3279F, 0.9924F);
		Head.addChild(head_r1);
		setRotationAngle(head_r1, -0.109F, 0.3323F, -0.3237F);
		head_r1.cubeList.add(new ModelBox(head_r1, 0, 16, 1.5F, -3.6F, -4.5F, 3, 3, 3, -0.1F, false));
		head_r1.cubeList.add(new ModelBox(head_r1, 2, 18, -0.5F, -2.6F, -3.5F, 3, 1, 1, -0.1F, false));
		head_r1.cubeList.add(new ModelBox(head_r1, 0, 16, -0.7F, -3.6F, -4.5F, 1, 3, 3, -0.1F, false));

		Pero22_r1 = new ModelRenderer(this);
		Pero22_r1.setRotationPoint(-0.9782F, -12.0928F, -0.3275F);
		Head.addChild(Pero22_r1);
		setRotationAngle(Pero22_r1, -2.9155F, -1.0494F, 1.4361F);
		Pero22_r1.cubeList.add(new ModelBox(Pero22_r1, 10, 50, 1.0804F, -8.9231F, -2.2467F, 0, 9, 5, 0.0F, false));

		Pero22_r2 = new ModelRenderer(this);
		Pero22_r2.setRotationPoint(-0.9782F, -12.0928F, -0.3275F);
		Head.addChild(Pero22_r2);
		setRotationAngle(Pero22_r2, 0.8352F, 0.7477F, 1.7454F);
		Pero22_r2.cubeList.add(new ModelBox(Pero22_r2, 10, 50, 0.0804F, -7.9231F, -1.2467F, 0, 9, 5, 0.0F, false));

		Pero21_r1 = new ModelRenderer(this);
		Pero21_r1.setRotationPoint(-0.9782F, -12.0928F, -0.3275F);
		Head.addChild(Pero21_r1);
		setRotationAngle(Pero21_r1, -2.7915F, 0.243F, 1.0617F);
		Pero21_r1.cubeList.add(new ModelBox(Pero21_r1, 0, 52, 0.0448F, -6.8982F, -3.2467F, 0, 7, 5, 0.0F, false));

		Pero22_r3 = new ModelRenderer(this);
		Pero22_r3.setRotationPoint(0.0218F, -10.0928F, 1.6725F);
		Head.addChild(Pero22_r3);
		setRotationAngle(Pero22_r3, -0.3988F, 0.2206F, 1.6955F);
		Pero22_r3.cubeList.add(new ModelBox(Pero22_r3, 10, 50, 0.0804F, -8.9231F, -2.2467F, 0, 9, 5, 0.0F, false));

		Pero21_r2 = new ModelRenderer(this);
		Pero21_r2.setRotationPoint(0.0218F, -10.0928F, 1.6725F);
		Head.addChild(Pero21_r2);
		setRotationAngle(Pero21_r2, 1.0909F, 0.5839F, 1.7253F);
		Pero21_r2.cubeList.add(new ModelBox(Pero21_r2, 0, 52, -0.9552F, 1.1018F, -1.2467F, 0, 7, 5, 0.0F, false));

		Pero21_r3 = new ModelRenderer(this);
		Pero21_r3.setRotationPoint(0.0218F, -10.0928F, 1.6725F);
		Head.addChild(Pero21_r3);
		setRotationAngle(Pero21_r3, 2.395F, 0.3757F, 1.573F);
		Pero21_r3.cubeList.add(new ModelBox(Pero21_r3, 0, 52, 2.0448F, -8.8982F, -0.2467F, 0, 7, 5, 0.0F, false));

		Pero21_r4 = new ModelRenderer(this);
		Pero21_r4.setRotationPoint(0.0218F, -10.0928F, 1.6725F);
		Head.addChild(Pero21_r4);
		setRotationAngle(Pero21_r4, 0.7558F, 0.1897F, 1.5121F);
		Pero21_r4.cubeList.add(new ModelBox(Pero21_r4, 0, 52, 1.0448F, -7.8982F, -2.2467F, 0, 7, 5, 0.0F, false));

		Pero21_r5 = new ModelRenderer(this);
		Pero21_r5.setRotationPoint(-0.9782F, -12.0928F, -0.3275F);
		Head.addChild(Pero21_r5);
		setRotationAngle(Pero21_r5, -0.119F, -0.3307F, -0.1411F);
		Pero21_r5.cubeList.add(new ModelBox(Pero21_r5, 46, 20, -3.9552F, -1.8982F, 0.7533F, 0, 7, 5, 0.0F, false));

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(0.0F, -8.0F, 1.0F);
		Head.addChild(head_r2);
		setRotationAngle(head_r2, -0.0436F, 0.0F, 0.0F);
		head_r2.cubeList.add(new ModelBox(head_r2, 0, 23, -5.8F, 0.3F, -6.5F, 11, 2, 11, 0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}